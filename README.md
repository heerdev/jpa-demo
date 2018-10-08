## DDL queries

CREATE TABLE person (
person_id INTEGER NOT NULL,
creation_date timestamp,
last_modified_date timestamp,
email text,
name text,
phone INTEGER,
is_enabled bool NOT NULL,
password text,
CONSTRAINT person_pkey PRIMARY KEY (person_id)
) ;


CREATE TABLE user_roles (
  user_roles_id INTEGER NOT NULL,
  role text,
  person_id INTEGER NOT NULL,
  CONSTRAINT user_roles_pkey PRIMARY KEY (user_roles_id)
) ;

CREATE TABLE sponsers_roles (
 sponsers_roles_id INTEGER NOT NULL,
  role text,
  sponser_id INTEGER NOT NULL,
  CONSTRAINT sponsers_roles_pkey PRIMARY KEY (sponsers_roles_id)
) ;

CREATE TABLE sponsers (
  sponser_id INTEGER NOT NULL,
  sponser_category text,
  user_roles_id integer,
  person_id INTEGER NOT NULL,
  creation_date timestamp,
	last_modified_date timestamp,
	created_by text ,
	updated_by text,
  CONSTRAINT sponsers_pkey PRIMARY KEY (sponser_id)
) ;

CREATE TABLE candidates (
  candidates_id integer NOT NULL,
   person_id integer NOT NULL,
  sponser_id integer,
	internal_reference text,
	assigned_Vetting_Officer_id INTEGER,
	Comments text,
	case_status_id integer, 
	activation_code integer,
	activation_code_expiry_date timestamp,
	interview_audio_id integer,
	interview_transcript text,
	interview_sar text,
	case_creation_date timestamp,
	creation_date timestamp,
	last_modified_date timestamp,
	created_by text ,
	updated_by text,
  CONSTRAINT candidates_pkey PRIMARY KEY (candidates_id)
) ;

CREATE TABLE case_status (
  case_status_id integer NOT NULL,
   case_status_text text,
  CONSTRAINT case_status_pkey PRIMARY KEY (case_status_id)
) ;

CREATE TABLE interview_audio (
  interview_audio_id integer NOT NULL,
  audio_data BYTEA NOT NULL,
  CONSTRAINT interview_audio_pkey PRIMARY KEY (interview_audio_id)
) ;

CREATE TABLE report_table (
  report_table_id integer NOT NULL,
  case_status_id integer,
  candidates_id integer,
  start_date timestamp,
  end_date timestamp,
 CONSTRAINT report_table_pkey PRIMARY KEY (report_table_id)
) ;

alter table user_roles add FOREIGN KEY(person_id) REFERENCES person(person_id);
alter table sponsers add FOREIGN KEY(person_id) REFERENCES person(person_id);
alter table sponsers add FOREIGN KEY(user_roles_id) REFERENCES user_roles(user_roles_id);
alter table candidates add FOREIGN KEY(person_id) REFERENCES person(person_id);
alter table candidates add FOREIGN KEY(case_status_id) REFERENCES case_status(case_status_id);
alter table candidates add FOREIGN KEY(interview_audio_id) REFERENCES interview_audio(interview_audio_id);

alter table report_table add FOREIGN KEY(case_status_id) REFERENCES case_status(case_status_id);
alter table report_table add FOREIGN KEY(candidates_id) REFERENCES candidates(candidates_id);