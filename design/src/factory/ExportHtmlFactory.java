package factory;

/**
 * Created by lucas on 2018/8/4.
 */
public class ExportHtmlFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        if("standard".equals(type)){

            return new ExportStandardHtmlFile();

        }else if("financial".equals(type)){

            return new ExportFinancialHtmlFile();

        }else{
            throw new RuntimeException("没有找到对象");
        }
    }
}
