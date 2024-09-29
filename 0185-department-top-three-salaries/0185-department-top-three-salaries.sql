/* Write your T-SQL query statement below */
WITH CTE AS(
    SELECT d.name AS Department, e.name AS Employee, e.salary,
    DENSE_RANK() OVER(PARTITION BY e.departmentId ORDER BY e.salary DESC)AS highest_salary
    FROM Employee e
    JOIN Department d ON e.departmentId = d.id
)

SELECT Department, Employee, salary AS Salary
FROM CTE
WHERE highest_salary IN (1, 2, 3)