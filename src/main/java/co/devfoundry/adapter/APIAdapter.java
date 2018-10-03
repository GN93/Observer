package co.devfoundry.adapter;

import co.devfoundry.adapter.api.LibraryAPI;
import co.devfoundry.adapter.api.LibraryAPIv2;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI {

    LibraryAPIv2 libraryAPIv2;
    User user;

    public APIAdapter(LibraryAPIv2 libraryAPIv2, User user) {
        this.libraryAPIv2 = libraryAPIv2;
        this.user = user;
    }

    @Override
    public boolean isAvailable(String bookTitle) {

        if(libraryAPIv2.numberOfAvailableCopies(bookTitle) > 0)
            return true;
        else
            return false;

    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {

        return libraryAPIv2.dueDate(bookTitle,user.getFirstName(),user.getLastName(),user.getDateOfBirth());

    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {

        return libraryAPIv2.reserve(bookTitle,user.getFirstName(),user.getLastName(),user.getDateOfBirth());

    }
}
