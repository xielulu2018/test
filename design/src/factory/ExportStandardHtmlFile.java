package factory;

/**
 * Created by lucas on 2018/8/4.
 */
public class ExportStandardHtmlFile implements  ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("导出标准HTML文件");
        return true;
    }
}
