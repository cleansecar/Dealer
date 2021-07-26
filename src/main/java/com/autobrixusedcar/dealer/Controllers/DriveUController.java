package com.autobrixusedcar.dealer.Controllers;

import com.autobrixusedcar.dealer.services.DriveUService;
import com.autobrixusedcar.dealer.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class DriveUController {

    @Autowired
    private DriveUService driveUService;

    @SuppressWarnings("unchecked")
    @GetMapping("/driveu/create")
    public ResponseEntity createDriveuBooking() {
        Map<String, Object> order = driveUService.createBooking();
        return Response.success(order);
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/driveu/cancel")
    public ResponseEntity cancelDriveuBooking() {
        Map<String, Object> order = driveUService.cancelBooking();
        return Response.success(order);
    }

}
