package factory;

/**
 * Created by lucas on 2018/8/4.
 */
public class TestDemo {
    public static void main(String[] args) {
        String data = "";
        ExportFactory exportFactory = new ExportHtmlFactory();
        ExportFile ef = exportFactory.factory("financial");
        ef.export(data);
        ExportPdfFactory exportPdfFactory = new ExportPdfFactory();
        ExportFile financial = exportPdfFactory.factory("standard");
        financial.export(data);
    }
}
