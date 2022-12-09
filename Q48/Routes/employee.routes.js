const {Router} = require("express");
const router = new Router();
const employeesServices = require("../Services/employees.service");
router.get("/getAllEmployees",employeesServices.getAllEmployees);
router.get("/getEmployee/:employeeId",employeesServices.getEmployee);

module.exports = router;