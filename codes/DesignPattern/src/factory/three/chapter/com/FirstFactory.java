//package factory.three.chapter.com;
//
///**
// * Created by lj on 16/10/9.
// */
//public class FirstFactory {
//
//    protected String type;
//
//    public FirstFactory(String t) {
//        type = t;
//    }
//
//    public Connection createConnection() {
//        if (type.equals("Oracle")) {
//            return new OracleConnection();
//        }
//        else if (type.equals("SQL Server")) {
//            return new SqlServerConnection();
//        }
//        else {
//            return new MySqlConnection();
//        }
//    }
//}
//
//
//
