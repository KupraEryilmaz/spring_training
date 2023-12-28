package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Integer> {

    //Display all region is in Canada
    List<Region> findByCountry(String country);
    List<Region> getByCountry(String country);//iki metot ayni islemi yapiyor

    //Display all region with country name includes 'United'

    List<Region> findByCountryContaining(String country);

//    Display all regions with country name includes 'United' in order(region)
    List<Region> findByCountryContainsOrderByRegion(String country);//query builder mekhanizmasini kullanarak method yaziyoruz implementation calisma zamaninda spring data jpa tarafindan sql implementation a donusturuluyor

    //Display top 2 regions in United States
    List<Region> findTopByCountry(String country);
    List<Region> findTop2ByCountry(String country);

    List<Region> findTopByCountryContainsOrderByRegion(String country);

}
