const studySession=JSON.parse(localStorage.getItem("studySessions")) || [];
const assignments=JSON.parse(localStorage.getItem("assignments")) || [];

function saveStudySession(){
    localStorage.setItem("studySessions",JSON.stringify(studySessions));
}
//save data functionality
function saveAssignment(){
    localStorage.setItem("assignment",JSON.stringify(assignments));
}
//study timetable//
const studyForm=document.getElementById("studyForm");
const sessionList=document.getElementById("sessionList");
const assignmentForm=document.getElementById("assignmentForm");
const assignmentList=document.getElementById("assignmentList");
function displayStudySessions(){
    sessionList.innerHTML="";
    studySession.forEach(function(session, index){
        const item=document.createElement("li");
        item.textContent='${session.subject} + "_" + ${session.day} + "at" + ${session.time} ';
        const deleteButton=document.createElement("button");
        deleteButton.textContent="Delete";
        deleteButton.addEventListener("click",function(){
            studySession.splice(index, 1);
            displayStudySessions();
        });
        item.appendChild(deleteButton);
        sessionList.appendChild(item);
    });
}

studyForm.addEventListener("submit",function(event){
    event.preventDefault();
    const subject= document.getElementById("subject").value;
    const day=document.getElementById("day").value;
    const time=document.getElementById("studyTime").value;
     const session={
        subject: subject,
        day: day,
        time: time
     };
     studySessions();
     saveStudySessions();
     displayStudySessions();
     studyForm.reset();
    });
        function displayAssignments(){
        assignment.forEach(function(asseignment,inde){
            const item=document.createElement("li");
            const detail=document.createElement("p");
            details.textContent=assignment.title + "|" + assignment.subject + "| Deadline: " + assignment.deadline + "| priority: " + assignment.priority;
            item.appendChild(details);
            if(assignment.completed){
                item.classList.add("assignment-completed");
            }
            //completion button
            const completeButton=document.createElement("button");
            completeButton.textContent=assignment,completed ? "Mark Pending" : "Mark Completed";
            completeButton.className="complete-btn";
            completeButton.addEventListener("click",function(){
                assignment.completed=! assignment.completed;
                saveAssignment();
                displayAssignments();
            });
            const deletebutton= document.createElement("button");
            deletebutton.textContent="delete";
            deletebutton.className="delete-btn";
            deleteButton.addEventListener("click",function(){
                assignment.slice(index, 1);
                saveAssignment();
                displayAssignments();
            });
            item.appendChild(completeButton);
            item.appendChild(deletebutton);
            assignmentList.appendChild(item);
        });
    }
    assignmentForm.addEventListener("submit",function(event){
        event.preventDefault();
        const title=document.getElementById("assignmentTitle").value;
        const subject=document.getElementById("assignmentSubject").value;
        const deadline =document.getElementById("deadline").value;
        const priority=document.getElementById("priority").value;
        const assignment={
            title : title,
            subject : subject,
            deadline: deadline,
            priority: priority,
            completed: false
        };
        assignment.push(assignment);
        saveAssignment();
        displayAssignments();
        assignmentForm.reset();
    });
    displayStudySessions();
    displayAssignments();
    function updateDashboard(){
        const totalSession=studySession.length;
        let totalHours=0;
        studySessions.forEach(function(session){
            totalHours+=Number(session.duration) || 0;
        });
        const totalAssignment=assignment.length;
        const completed=assignment.filter(function(assignment){
            return assignment.completed;
        }).length;
        const pending=totalAssingment-completed;
        document.getElementById("totalSession").textContent=totalSession;
        document.getElementById("totalHours").textContent=totalHours;
        document.getElementById("totalAssignment").textContent=totalAssignment;
        document.getElementById("completedAssignment").textContent=completed;
        document.getElementById("pendingAssignment").textContent=pending;
    }
    updateDashboard();
    updateProgress();

    function updateProgress(){
        const total=assignment.length;
        const completed=assignment.filter(function(assignment){
            return assignment.completed;
        }).length;
        let percentage=0;
        if(total>0){
            percentage=(complated/total)*100;
        }
        document.getElementById("completionPercentage").textContent=percentage.toFixed(1) + " %";
        document.getElementById("progressFill").style.width=percentage + "%";
    }
