package by.grouk.callhandler.utils.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Alena_Grouk on 8/3/2016.
 */
@Aspect
public class LoggingWriterAspect {
    @AfterThrowing(pointcut = "execution(* by.grouk.callhandler.utils.writer.*.*(..))",
            throwing = "exception")
    public void inBusinessLayer(final JoinPoint joinPoint, Throwable exception) {
        Logger logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
        logger.error(joinPoint.getSignature().getName() + "() failed", exception);
    }
}
