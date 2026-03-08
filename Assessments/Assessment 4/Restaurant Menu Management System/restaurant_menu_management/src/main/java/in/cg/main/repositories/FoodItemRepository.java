package in.cg.main.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import in.cg.main.entities.FoodItem;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long>{

    @Query("SELECT f FROM FoodItem f WHERE f.restaurantId = :restaurantId")
    List<FoodItem> findByRestaurantId(Long restaurantId);
}