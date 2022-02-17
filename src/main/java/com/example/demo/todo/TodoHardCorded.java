package com.example.demo.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardCorded {
	
	
	private static List<Todo> todos = new ArrayList();
	private static int Counter = 0;
	
	static {
		todos.add(new Todo(++Counter, "karthi", "Trainer",new Date(), false));
		todos.add(new Todo(++Counter, "rajan", "Trainer",new Date(), false));
		todos.add(new Todo(++Counter, "soundar", "Trainer",new Date(), false));
		todos.add(new Todo(++Counter, "ajith", "Trainer",new Date(), false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo updateTodo(Todo todo) {
		if(todo.getId() == -1) {
			todo.setId(++Counter);
			todos.add(todo);
		}else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	
	public Todo deleteById(int id){
		
		Todo todo = findById(id);
		
		if(todo == null) {
			return null;
		}
		
		if(todos.remove(todo)) {
			return todo;
		}
		
		return null;
		
	}

	public Todo findById(int id) {
		
		for (Todo todo : todos) {
			
			if(todo.getId() == id) {
				return todo;
			}
			
		}
		
		return null;
	}
	

}
