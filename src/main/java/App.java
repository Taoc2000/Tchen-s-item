

import com.tchen.dao.BookDao;
import com.tchen.service.BookService;
import com.tchen.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;

public class App {
    public static void main(String[] args) {
        //BookService bookService = new BookServiceImpl();
        //bookService.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
        
        //ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ctx.registerShutdownHook();

        //在此处会抛出异常 bean未初始化就容器关闭
        //ctx.close();

        //BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        //bookDao.save();
        //ctx.close();





    }
}
