/**
 *
 * Log Format
 * • Date and Time: Millisecond precision and easily sortable.
 * • Log Level: ERROR, WARN, INFO, DEBUG, or TRACE.
 * • Process ID.
 * • A --- separator to distinguish the start of actual log messages.
 * • Thread name: Enclosed in square brackets (may be truncated for console output).
 * • Logger name: This is usually the source class name (often abbreviated).
 * • The log message
 *
 * application.properties   debug=true
 * run arguments java -jar myapp.jar --debug
 *
 * <b>File Output</b>
 * application.properties
 *  logging.file / logging.path
 *
 *
 * logback-spring.xml
 *
 * <b>Log leverls</b>
 * logging.level.root=WARN
 * logging.level.org.springframework.web=DEBUG
 * logging.level.org.hibernate=ERROR
 *
 * @author jimi
 * @date 2020/7/21 15:43
 * @version 1.0
 */
package com.jimi.spring.boot.log;