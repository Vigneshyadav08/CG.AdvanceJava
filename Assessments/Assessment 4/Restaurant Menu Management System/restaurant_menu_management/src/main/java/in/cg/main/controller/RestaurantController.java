package in.cg.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import in.cg.main.dto.RestaurantDTO;
import in.cg.main.entities.Restaurant;
import in.cg.main.services.RestaurantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    public Page<Restaurant> getRestaurants(
            @RequestParam int page,
            @RequestParam int size){

        return restaurantService.getRestaurants(page,size);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public Restaurant addRestaurant(@RequestBody RestaurantDTO dto){

        return restaurantService.addRestaurant(dto);
    }
}