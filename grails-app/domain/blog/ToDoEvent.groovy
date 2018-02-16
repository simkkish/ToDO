package blog

import com.sun.istack.internal.Nullable

class ToDoEvent {
    String content
    boolean completed
    Date dateCreated= new Date()
    Date dateModified=new Date()
    static constraints = {
        completed Nullable:true
        dateCreated Nullable:true
        dateModified Nullable:true
    }
}
