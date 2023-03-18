package com.example.elizavetaproject.service;

import com.example.elizavetaproject.dto.AddGroupRequestDto;
import com.example.elizavetaproject.dto.AllGroupResponseDto;
import com.example.elizavetaproject.entity.Group;
import com.example.elizavetaproject.repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class GroupServiceImpl implements GroupService{

    private final GroupRepository groupRepository;


    @Override
    public void addGroup(AddGroupRequestDto addGroupRequestDto) {
    Group group = new Group();
    group.setNumber(addGroupRequestDto.getNumber());
    groupRepository.save(group);
    }

    @Override
    public List<AllGroupResponseDto> getAllGroups() {
        List<Group> groups=groupRepository.findAll();
        return null;
    }

    @Override
    public Group getGroup(int id) {
       Group group = null;
        Optional<Group> gr = groupRepository.findById(id);
        if(gr.isPresent()){
            group=gr.get();
        }
        return group;
    }

    @Override
    public void deleteGroup(int id) {
        groupRepository.deleteById(id);
    }


}



