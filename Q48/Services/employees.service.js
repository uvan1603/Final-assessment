
const Employees = [{name:"Dhanush",employeeId:12349,role:"Hacker"},
                   {name:"Surya",employeeId:12346,role:"FrontEndDeveloper"},
                   {name:"Ajith",employeeId:12347,role:"BackEndDeveloper"},
                   {name:"Vijay",employeeId:12348,role:"DataAnalyst"},
                   {name:"Simbu",employeeId:12340,role:"FullStackDeveloper"}
                ];

//a. getting all employees

module.exports.getAllEmployees = async(req,res,next)=>{

    res.send(Employees);

};

//b. getting employee by id
module.exports.getEmployee = async(req,res,next)=>
{
   for(let i=0;i<Employees.length;i++)
   {
      if(Employees[i].employeeId == req.params.employeeId)
      {
        res.send(Employees[i]);
      }
   }
};



