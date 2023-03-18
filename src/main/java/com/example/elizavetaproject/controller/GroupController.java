package com.example.elizavetaproject.controller;

import com.example.elizavetaproject.dto.AddGroupRequestDto;
import com.example.elizavetaproject.dto.AllGroupResponseDto;
import com.example.elizavetaproject.entity.Group;
import com.example.elizavetaproject.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path="/groups")
@RequiredArgsConstructor
@RestController
public class GroupController {
@Autowired
    private final GroupService groupService;

    @PostMapping
    public void addGroup(@RequestBody AddGroupRequestDto addGroupRequestDto){
       groupService.addGroup(addGroupRequestDto);
    }
    @RequestMapping(value = "/groups", method = RequestMethod.GET)
    //@GetMapping("/groups")
    public List<AllGroupResponseDto> getAllGroups(){
        if(0==0){
            throw new WrongDataException();
        }
        //List<Group> allGroups = groupService.getAllGroups();
        return null;
    }

    @GetMapping("/groups/{id}")
    public Group getGroup(@PathVariable int id){
        Group group = groupService.getGroup(id);

        return group;
    }

    @DeleteMapping("/groups/{id}")
    public void deleteStudent(@PathVariable int id){
        Group group = groupService.getGroup(id);

        groupService.deleteGroup(id);
    }
}
