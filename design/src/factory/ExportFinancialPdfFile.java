package factory;

/**
 * Created by lucas on 2018/8/4.
 */
public class ExportFinancialPdfFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("导出财务版PDF文件");
        return true;
    }
}
