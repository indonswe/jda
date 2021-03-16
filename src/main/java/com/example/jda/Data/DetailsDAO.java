package com.example.jda.Data;

import com.example.jda.models.Details;

import java.util.Collection;

public interface DetailsDAO {
    Details findById(Integer detailsId);
    Collection<Details> findAll();
    Details create(Details details);
    Details update(Details details);
    void delete(Integer details);
}
