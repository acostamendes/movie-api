import org.aspectj.internal.lang.reflect.StringToType;
import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.descriptor.java.StringJavaType;

public class SQLiteDialect extends Dialect {
    public SQLiteDialect(){
        registerFunction("group_concat", new StandardSQLFunction("group_concat", new StringType()));
    }
}
