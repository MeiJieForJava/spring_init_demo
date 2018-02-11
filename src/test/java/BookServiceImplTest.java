import com.learn.meijie.entity.Book;
import com.learn.meijie.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author meijie
 */
public class BookServiceImplTest extends BookDaoTest {
  @Autowired
  private BookService bookService;

  @Test
  public void getById() {
    //在service里面改了一下名字，其实就是dao里面的queryById
    Book book = bookService.getById(1);
    System.out.println(book);
  }
}