package mate.academy.springboot.swagger.mapper.impl.request;

import mate.academy.springboot.swagger.dto.request.ProductRequestDto;
import mate.academy.springboot.swagger.mapper.DtoRequestMapper;
import mate.academy.springboot.swagger.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductRequestMapper implements DtoRequestMapper<ProductRequestDto, Product> {
    @Override
    public Product fromDto(ProductRequestDto dto) {
        Product product = new Product();
        product.setTitle(dto.getTitle());
        product.setPrice(dto.getPrice());
        return product;
    }
}