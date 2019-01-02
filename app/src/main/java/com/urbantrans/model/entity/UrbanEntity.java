package com.urbantrans.model.entity;

/**
 * Simple marker interface to work with generic CRUD DAO
 * Created by alexander_borohov on 8.9.17.
 */
public interface UrbanEntity<I> {
    I getId();
    void setId(I id);
}
