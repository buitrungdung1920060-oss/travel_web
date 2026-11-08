package entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "destinations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Destination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;          // Tên địa điểm
    private String province;      // Tỉnh/Thành phố
    private String region;        // Vùng miền (Miền Bắc, Miền Trung, Miền Nam)
    private String category;      // Danh mục (Thiên nhiên, Văn hóa, Ẩm thực...)
    
    private double latitude;      // Vĩ độ (GPS)
    private double longitude;     // Kinh độ (GPS)
    
    private double price;         // Chi phí
    private double rating;        // Điểm đánh giá (1-5)
    
    private String address;       // Địa chỉ chi tiết
    
    @Column(columnDefinition = "TEXT")
    private String description;   // Mô tả chi tiết địa điểm
}