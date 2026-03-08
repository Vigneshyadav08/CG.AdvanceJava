package in.cg.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import in.cg.main.dto.RestaurantDTO;
import in.cg.main.entities.Restaurant;
import in.cg.main.repositories.RestaurantRepository;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public Restaurant addRestaurant(RestaurantDTO dto){

        Restaurant r = new Restaurant();

        r.setName(dto.getName());
        r.setLocation(dto.getLocation());
        r.setRating(dto.getRating());

        return restaurantRepository.save(r);
    }

    public Page<Restaurant> getRestaurants(int page,int size){

        Pageable pageable = PageRequest.of(page,size);

        return restaurantRepository.findAll(pageable);
    }
}