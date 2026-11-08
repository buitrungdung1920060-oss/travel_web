package repository;

import entity.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long> {
    
    // Tìm kiếm địa điểm theo vùng miền
    List<Destination> findByRegion(String region);
    
    // Tìm kiếm địa điểm gần đúng theo tên
    List<Destination> findByNameContainingIgnoreCase(String name);
    
    // Lọc theo khoảng giá tối đa
    List<Destination> findByPriceLessThanEqual(double maxPrice);
}