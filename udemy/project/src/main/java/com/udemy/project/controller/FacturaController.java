//package com.udemy.project.controller;
//
//import com.udemy.project.entity.Factura;
//import com.udemy.project.service.FacturaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataAccessException;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.time.LocalDate;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//@CrossOrigin(origins = {"yourdomain.com"}, methods = {RequestMethod.GET, RequestMethod.POST})
//@RestController
//@RequestMapping("/facturas")
//public class FacturaController {
//
//    @Autowired
//    FacturaService service;
//
//    Map<String, Object> response = new HashMap<>();
//
//    @GetMapping("/")
//    public ResponseEntity<?>getAll(){
//        try{
//            return new ResponseEntity<>(service.findAll(),HttpStatus.OK);
//        }catch (DataAccessException e){
//            response.put("Error", e.getMessage().concat("")
//                    .concat(e.getMostSpecificCause().getMessage()));
//            return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<?> getById(@PathVariable("id") long id) {
//        if (service.findById(id).isEmpty()) {
//            response.put("Warning", "Id does not exist, please check it again");
//            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
//        }
//        try {
//            return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
//        } catch (DataAccessException e) {
//            response.put("Error", e.getMessage().concat("")
//                    .concat(e.getMostSpecificCause().getMessage()));
//            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//
//
//    @GetMapping("/{ob}")
//    public ResponseEntity<?> getByObservation(@PathVariable("ob")String ob){
//        if(service.findByObservacion(ob).isEmpty()){
//            response.put("Warning", "No matches found");
//            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
//        }try {
//            return new ResponseEntity<>(service.findByObservacion(ob), HttpStatus.OK);
//        } catch (DataAccessException e) {
//            response.put("Error", e.getMessage().concat("")
//                    .concat(e.getMostSpecificCause().getMessage()));
//            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/{date}")
//    public ResponseEntity<?> getByDate(@PathVariable("date") LocalDate date){
//        if(service.findByCreateAt(date).isEmpty()){
//            response.put("Warning", "No matches found");
//            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
//        }try {
//            return new ResponseEntity<>(service.findByCreateAt(date), HttpStatus.OK);
//        } catch (DataAccessException e) {
//            response.put("Error", e.getMessage().concat("")
//                    .concat(e.getMostSpecificCause().getMessage()));
//            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @PostMapping("/")
//    public ResponseEntity<?> save(@Valid @RequestBody Factura newFactura, BindingResult result) {
//        if (result.hasErrors()) {
//            List<String> errors = result.getFieldErrors()
//                    .stream()
//                    .map(err -> "Value '" + err.getField() + "' " + err.getDefaultMessage()
//                    ).collect(Collectors.toList());
//            response.put("Errors", errors);
//            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
//        }
//        try {
//            return new ResponseEntity<>(service.save(newFactura), HttpStatus.CREATED);
//        } catch (DataAccessException e) {
//            response.put("Error", e.getMessage().concat("")
//                    .concat(e.getMostSpecificCause().getMessage()));
//            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//    @PatchMapping("/{id}")
//    /*
//    el BindingResult debe estar antes de PathVariable, ojo!!
//     */
//    public ResponseEntity<?> update(@Valid @RequestBody Factura newData, BindingResult result, @PathVariable("id") long id) {
//        if (result.hasErrors()) {
//            List<String> errors = result.getFieldErrors()
//                    .stream()
//                    .map(err -> "Value '" + err.getField() + "' " + err.getDefaultMessage()
//                    ).collect(Collectors.toList());
//            response.put("Errors", errors);
//            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
//        }
//        else if (service.findById(id) == null) {
//            response.put("Warning", "Id does not exist, please check it again");
//            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
//        }
//        try {
//
//            return new ResponseEntity<>(service.update(newData, id), HttpStatus.CREATED);
//        } catch (DataAccessException e) {
//            response.put("Error", e.getMessage().concat("")
//                    .concat(e.getMostSpecificCause().getMessage()));
//            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable("id") long id) {
//        if (service.findById(id) == null) {
//            response.put("Warning", "Id does not exist, please check it again");
//            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
//        }
//        try {
//            service.delete(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } catch (DataAccessException e) {
//            response.put("Error", e.getMessage().concat("")
//                    .concat(e.getMostSpecificCause().getMessage()));
//            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//}
