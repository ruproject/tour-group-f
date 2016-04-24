use tourgroup;
create table users (
  id            serial,
  full_name     nvarchar(2048),
  user_name     nvarchar(2048),
  user_pwd      varchar(2048),
  department    nvarchar(2048),
  status        nvarchar(2048)
  
);

insert into users(full_name, user_name, user_pwd, department, status)
  values('Administrator','admin', sha2('admin', 256), 'OP', 'Active');
