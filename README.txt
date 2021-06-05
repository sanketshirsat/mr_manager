MEDICAL REPRESENTATIVE MANAGEMENT SYSTEM

1. import maven project
2. uppdate maven project
3. run as Spring boot project

GIT Link - https://github.com/sanketshirsat/mr_manager

Restful API's

1.  URL : http://localhost:8080/medical-representative/save
    Method : POST
    Request Body :
{
    "name": "Harshal Joshi",
    "companyName": "Cipla",
    "address": "Akola",
    "drug": [
        {
            "name": "Allopurinol",
            "description": "To prevents osteoporosis",
            "category": "Defunct Drug"
        },
        ...
    ]
}

2.  URL : http://localhost:8080/medical-representative/update/{id}
    Method : PUT
    Request Body :
{
     "mrId": 1,
    "name": "Harshal Joshi",
    "companyName": "Cipla",
    "address": "Akola",
    "drug": [
        {
            "mrId": 1,
	    "drugId": 5,
            "name": "Allopurinol",
            "description": "To prevents osteoporosis",
            "category": "Defunct Drug"
        },
        ...
    ]
}

3.  URL : http://localhost:8080/medical-representative/getMedRep/{id}
    Method : GET


4.  URL : http://localhost:8080/medical-representative/getAllMedReps
    Method : GET

5.  URL : http://localhost:8080/medical-representative/delete/{id}
    Method : GET