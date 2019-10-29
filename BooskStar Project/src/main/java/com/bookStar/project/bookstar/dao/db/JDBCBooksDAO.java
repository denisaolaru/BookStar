package com.bookStar.project.bookstar.dao.db;

import com.bookStar.project.bookstar.dao.BooksDAO;
import com.bookStar.project.bookstar.domain.Books;

import java.util.Collection;

public class JDBCBooksDAO implements BooksDAO {


    @Override
    public Collection<Books> searchByTitle(String query) {
        return null;
    }

    @Override
    public Collection<Books> getAll() {
        return null;
    }

    @Override
    public Books findById(Long id) {
        return null;
    }

    @Override
    public Books update(Books model) {
        return null;
    }

    @Override
    public boolean delete(Books model) {
        return false;
    }
}
