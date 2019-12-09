package com.ankur.inventory.service;


import com.ankur.inventory.domain.InventoryListAllResponse;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import org.springframework.http.ResponseEntity;

public class InventoryServiceTests {

    private InventoryService inventoryService;

    @Test
    public void test(){
        inventoryService = mock(InventoryService.class);
//        inventoryService = new InventoryService();

//
//        when(db.getPrice(googleStock)).thenReturn(50.00);
//
//        ResponseEntity<InventoryListAllResponse> result = (ResponseEntity<InventoryListAllResponse>)inventoryService.listAll();
//        InventoryListAllResponse response = result.getBody();
//        System.out.println("response = "+response);

    }
}
