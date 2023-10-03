/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.polstat.perpustakaan.service;

/**
 *
 * @author asus
 */
import com.polstat.perpustakaan.dto.UserDto;

public interface UserService {

    public UserDto createUser(UserDto user);

    public UserDto getUserByEmail(String email);
}
