
-- create tables
CREATE TABLE employees (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    address VARCHAR(255),
    supervisor_id INTEGER REFERENCES employees(id)
);

CREATE TABLE projects (
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    leader_id INTEGER REFERENCES employees(id)
);

CREATE TABLE project_members (
    project_id INTEGER REFERENCES projects(id),
    member_id INTEGER REFERENCES employees(id)
);

-- insert dummy data
INSERT INTO employees VALUES
(1, 'John', 'Doe', 'Street #215', null),
(2, 'Jane', 'Doe', 'Street #711', 1);

INSERT INTO projects VALUES
(1, 'Firestone', 1),
(2, 'Blue', 2);

INSERT INTO project_members VALUES
(1, 1),
(2, 1),
(2, 2);

-- exercise: Single-table selection

-- 1. list the last names of the employees whos
-- id are less than 10 (remove duplicates and
-- sort by alphabetical order)
SELECT DISTINCT last_name FROM employees
WHERE id < 10
ORDER BY last_name;

