package academy.learnprogramming.service;

import academy.learnprogramming.model.TodoData;
import academy.learnprogramming.model.TodoItem;

public interface TodoItemService {

    public void addItem(TodoItem itemToAdd);

    public void removeItem(int id);

    public TodoItem getItem(int id);

    public void updateItem(TodoItem itemToUpdate);

    public TodoData getData();
}
