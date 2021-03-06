package com.hyberlet.quendless.repository;

import com.hyberlet.quendless.model.Queue;
import com.hyberlet.quendless.model.QueueMember;
import com.hyberlet.quendless.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QueueMemberRepository extends JpaRepository<QueueMember, Long> {
    List<QueueMember> getQueueMembersByQueueOrderByPositionAsc(Queue queue);
    QueueMember getQueueMembersByQueueAndUser(Queue queue, User user);
}
