package dal.datasourceswitch;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
/**
 * Created by Administrator on 2016/8/22.
 */

/**
 * Created by rabbit on 14-5-25.
 */
public class MultipleDataSource extends AbstractRoutingDataSource {

    private static ThreadLocal<String> threadLocalDatasource=new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return null;
        }
    };

    public static void setThreadLocalDatasource(String dsName){
        threadLocalDatasource.set(dsName);
    }


    @Override
    protected Object determineCurrentLookupKey() {
        return threadLocalDatasource.get();
    }
}
