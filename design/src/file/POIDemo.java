package file;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by lucas on 2018/8/6.
 */
public class POIDemo {
    public static void main(String[] args) throws IOException {

        System.out.println("输入点名人数：");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        Integer count = Integer.parseInt(next);
        List<Integer> list = new ArrayList<>();
        int a = 0;
        for (int i = 0; i < count; i++) {
            a = (int) (Math.random() * 50 + 1);
            while(list.contains(a)){
                a = (int) (Math.random() * 50 + 1);
            }
            list.add(a);
        }
        System.out.println(list);
        File file = new File("HAP.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);
        int flag = 0;
        for (Row row : sheet) {
            if(flag<1){
                flag++;
                continue;
            }
            for (Integer id : list) {
                if (id == (int) row.getCell(0).getNumericCellValue()) {
                    System.out.println("姓名：" + row.getCell(2).getStringCellValue());
                }
            }
        }
    }
}
