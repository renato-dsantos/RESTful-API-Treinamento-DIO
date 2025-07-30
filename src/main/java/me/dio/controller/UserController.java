package me.dio.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bing.annotation.GetMapping;
import org.springframework.web.bing.annotation.PathVariable;
import org.springframework.web.bing.annotation.RequestMapping;
import org.springframework.web.bing.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        var user = userService.findById(id);
        return ResponseEntity.ok(user);

    }

    @PostMapping("/{id}")
    public ResponseEntity<User> create(@RequestBody User userToCreater){
        var userCreater = userService.create(userToCreater);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreater.getId())
                .toUri();
        return ResponseEntity.created(location).bady(userCreater);

    }

}