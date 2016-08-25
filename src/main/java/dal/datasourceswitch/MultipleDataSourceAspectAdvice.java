package dal.datasourceswitch;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MultipleDataSourceAspectAdvice {

    @Around("execution(* dal.mapper.myone..*.*(*))")
    public Object doAround1(ProceedingJoinPoint jp) throws Throwable {
        MultipleDataSource.setThreadLocalDatasource("myone");
        return jp.proceed();
    }

    @Around("execution(* dal.mapper.mytwo..*.*(*))")
    public Object doAround2(ProceedingJoinPoint jp) throws Throwable {
        MultipleDataSource.setThreadLocalDatasource("mytwo");
        return jp.proceed();
    }

}