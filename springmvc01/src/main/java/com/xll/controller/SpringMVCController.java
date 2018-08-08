package com.xll.controller;

import com.xll.entity.User;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

/**
 * Created by lucas on 2018/8/6.
 */
//@SessionAttributes(value = {"user"})
@Controller
public class SpringMVCController {

    @RequestMapping("/hello")
    public String test(Map<String,Object> map){
        map.put("user", Arrays.asList("Tom","Jack","Jerry"));
        return "index";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("time",new Date());
        return modelAndView;
    }

    @RequestMapping("/testSessions")
    public String testSessions(Map<String,Object> map){
        map.put("user", Arrays.asList("Tom","Jack","Jerry"));
        return "index";
    }

    @RequestMapping("/testModelAttr")
    public String testModelAttr(@ModelAttribute("aaa") User users){
        System.out.println("修改："+users);
        return "index";
    }
    @ModelAttribute
    public void getUser(@RequestParam("id") Integer id, Map<String,Object> map){
        if(id!=null){
            User user = new User(1,"xll","12345",12);
            map.put("aaa",user);
        }
    }
    @RequestMapping("/testUpload")
    public String testUpload(@RequestParam("file") MultipartFile file, @RequestParam("desc") String desc,
                             HttpServletRequest request) throws IOException {
        System.out.println("desc:"+desc);
        System.out.println("fileName:"+file.getOriginalFilename());
        String filename = file.getOriginalFilename();
        String realPath = request.getSession().getServletContext().getRealPath("/");
        System.out.println(realPath);
        File f = new File(realPath,filename);
        boolean newFile = f.createNewFile();
        if(newFile){
            file.transferTo(f);
        }
        return "index";
    }
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request, @RequestParam("filename") String filename,
                                           Model model) throws IOException {
        String realPath = request.getSession().getServletContext().getRealPath("/");
        File file = new File(realPath + File.separator + filename);
        HttpHeaders headers = new HttpHeaders();
        //下载显示的文件名，解决中文名称乱码问题
//        String downloadFielName = new String(filename.getBytes("UTF-8"),"UTF-8");
        //通知浏览器以attachment（下载方式）打开图片
        headers.setContentDispositionFormData("attachment", filename);
        //application/octet-stream ： 二进制流数据（最常见的文件下载）。
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);
    }

    @RequestMapping("/testException")
    public String testException(@RequestParam("id") Integer id){
        System.out.println(10/id);
        return "index";
    }
//    @ExceptionHandler({ArithmeticException.class})
//    public ModelAndView handleException(Exception ex){
//        ModelAndView modelAndView = new ModelAndView("error");
//        modelAndView.addObject("exception",ex);
//        System.out.println("Exception:"+ex);
//        return modelAndView;
//    }

}
