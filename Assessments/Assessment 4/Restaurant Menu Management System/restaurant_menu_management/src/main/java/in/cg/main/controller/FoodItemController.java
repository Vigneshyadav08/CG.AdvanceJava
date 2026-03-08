package in.cg.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import in.cg.main.dto.FoodItemDTO;
import in.cg.main.entities.FoodItem;
import in.cg.main.services.FoodItemService;

@RestController
@RequestMapping("/fooditems")
public class FoodItemController {

    @Autowired
    private FoodItemService foodService;

    @PostMapping("/{restaurantId}/fooditems")
    @PreAuthorize("hasRole('ADMIN')")
    public FoodItem addFoodItem(
            @PathVariable Long restaurantId,
            @RequestBody FoodItemDTO dto){

        return foodService.addFoodItem(restaurantId,dto);
    }

    @GetMapping("/{restaurantId}/fooditems")
    public List<FoodItem> getFoodItems(@PathVariable Long restaurantId){

        return foodService.getFoodItems(restaurantId);
    }
}