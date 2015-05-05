package CAMT.SE331.TermProject.Repository;

import CAMT.SE331.TermProject.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Taro on 3/18/2015.
 */
public interface ProductRepository extends JpaRepository<Product,Long> {
}
