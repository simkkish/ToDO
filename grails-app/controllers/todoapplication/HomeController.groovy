package todoapplication

import blog.ToDoEvent

class HomeController {

    def index() {
        render view:"index"
    }
    def save(ToDoEvent todo){
        if (todo.validate()) {
            todo.save flush: true, failOrError: true
            flash.message = "Your request has been successfully received. We will be in touch with you shortly."
        } else {      // something failed
            flash.message = "Error occurred while saving your request."
        }
        redirect action: "index"
    }
    def list(){
        List<ToDoEvent> todoList=ToDoEvent.list()
        render view: "index", model: [todos: todoList]
    }
}
