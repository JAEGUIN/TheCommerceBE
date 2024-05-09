package com.jaeguin.commerce.service;

import com.jaeguin.commerce.domain.RegiUserDTO;
import com.jaeguin.commerce.domain.UpdateUserDTO;
import com.jaeguin.commerce.domain.User;
import com.jaeguin.commerce.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Slf4j
@Service
public class UserService {

    private final UserRepository repository;

    private static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Transactional
    public void regiUser(RegiUserDTO dto) {
        try{
            logger.info("save start");
            int userId = repository.findUserCountById(dto.getId());
            if(userId>0){
                throw new Exception("이미 존재하는 id 입니다.");
            }else {
                repository.save(dto.toEntity());
                logger.info("save completed");
            }
        }catch (Exception e){
            logger.info("save failed");
            e.printStackTrace();
        }
    }

    @Transactional(readOnly = true)
    public Page<User> findAllUsers(int page, int pageSize, String sortDirection, String sortBy) {
        Sort.Direction direction = sortDirection.equalsIgnoreCase("desc") ? Sort.Direction.DESC : Sort.Direction.ASC;
        PageRequest pageRequest = PageRequest.of(page, pageSize, Sort.by(direction, sortBy));
        return repository.findAll(pageRequest);
    }

    @Transactional
    public User updateUser(String id, UpdateUserDTO dto) {
        User user = new User();
        try {
            logger.info("update start");
            user = repository.findUserById(id).orElseThrow(()
                    -> new IllegalArgumentException("해당 id가 없습니다. id=" + id));
            user.update(dto.getUpdateTime(), dto.getEmail(), dto.getName(), dto.getPassword()
                    , dto.getNickname(), dto.getPhonenumber(), dto.getUpdateTime());
            logger.info("update completed");
            return user;
        } catch (Exception e) {
            logger.info("update failed");
            e.printStackTrace();
        }
        return user;
    }
}
