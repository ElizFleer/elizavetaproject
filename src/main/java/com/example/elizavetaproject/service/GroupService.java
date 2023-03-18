package com.example.elizavetaproject.service;

import com.example.elizavetaproject.dto.AddGroupRequestDto;
import com.example.elizavetaproject.dto.AllGroupResponseDto;
import com.example.elizavetaproject.entity.Group;

import java.util.List;

public interface GroupService {
    void addGroup(AddGroupRequestDto addGroupRequestDto);

    public List<AllGroupResponseDto> getAllGroups();

    public Group getGroup(int id);

    void deleteGroup(int id);
}
