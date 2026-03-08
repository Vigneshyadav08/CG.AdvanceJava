package in.cg.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cg.main.dto.FoodItemDTO;
import in.cg.main.entities.FoodItem;
import in.cg.main.repositories.FoodItemRepository;

@Service
public class FoodItemService {

    @Autowired
    private FoodItemRepository foodRepository;

    public FoodItem addFoodItem(Long restaurantId, FoodItemDTO dto){

        FoodItem item = new FoodItem();

        item.setName(dto.getName());
        item.setPrice(dto.getPrice());
        item.setCategory(dto.getCategory());
        item.setRestaurantId(restaurantId);

        return foodRepository.save(item);
    }

    public List<FoodItem> getFoodItems(Long restaurantId){

        return foodRepository.findByRestaurantId(restaurantId);
    }
}