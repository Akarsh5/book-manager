package com.sanju.bm.core.repository;

import com.sanju.bm.core.entity.AuthorEntity;
import com.sanju.bm.core.entity.BookShelfEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface BookShelfRepository  extends JpaRepository<BookShelfEntity, Long> {
}
