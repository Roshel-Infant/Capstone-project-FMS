/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.16).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.cognizant.api;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.model.Feedback;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-05T15:18:59.659+05:30[Asia/Calcutta]")
@Api(value = "feedbacks", description = "the feedbacks API")
@CrossOrigin("http://localhost:3000")
public interface FeedbacksApi {

	Logger log = LoggerFactory.getLogger(FeedbacksApi.class);

	default Optional<ObjectMapper> getObjectMapper() {
		return Optional.empty();
	}

	default Optional<HttpServletRequest> getRequest() {
		return Optional.empty();
	}

	default Optional<String> getAcceptHeader() {
		return getRequest().map(r -> r.getHeader("Accept"));
	}

	@ApiOperation(value = "Add Feedbacks", nickname = "addFeedbacks", notes = "Add Feedbacks to theEvent", response = Feedback.class, tags = {
			"Feedbacks", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Feedback.class),
			@ApiResponse(code = 201, message = "Created"), @ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 403, message = "Forbidden"), @ApiResponse(code = 404, message = "Not Found") })
	@RequestMapping(value = "/feedbacks", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	default Flux<ResponseEntity<Feedback>> addFeedbacks(
			@ApiParam(value = "", required = true) @Valid @RequestBody Feedback body) {
		if (getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
			if (getAcceptHeader().get().contains("application/json")) {
				try {
					return Flux.just(new ResponseEntity<>(getObjectMapper().get().readValue(
							"{\r\n  \"Unregistered\" : {\r\n    \"comment\" : \"comment\"\r\n  },\r\n  \"NotParticipated\" : {\r\n    \"comment\" : \"comment\"\r\n  },\r\n  \"ParticipatedFeedBack\" : {\r\n    \"dislike\" : \"dislike\",\r\n    \"rating\" : \"rating\",\r\n    \"likes\" : \"likes\"\r\n  }\r\n}",
							Feedback.class), HttpStatus.NOT_IMPLEMENTED));
				} catch (IOException e) {
					log.error("Couldn't serialize response for content type application/json", e);
					return Flux.just(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
				}
			}
		} else {
			log.warn(
					"ObjectMapper or HttpServletRequest not configured in default FeedbacksApi interface so no example is generated");
		}
		return Flux.just(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));
	}

	@ApiOperation(value = "Get  Feedbacks", nickname = "getFeedback", notes = "Get the Feedbacks for the Events", response = Feedback.class, tags = {
			"Feedbacks", })
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Feedback.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found") })
	@RequestMapping(value = "/feedbacks/{eventId}", produces = { "application/json" }, method = RequestMethod.GET)
	default Flux<ResponseEntity<Feedback>> getFeedback(
			@ApiParam(value = "", required = true) @PathVariable("eventId") String eventId) {
		if (getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
			if (getAcceptHeader().get().contains("application/json")) {
				try {
					return Flux.just(new ResponseEntity<>(getObjectMapper().get().readValue(
							"[ {\r\n  \"Unregistered\" : {\r\n    \"comment\" : \"comment\"\r\n  },\r\n  \"NotParticipated\" : {\r\n    \"comment\" : \"comment\"\r\n  },\r\n  \"ParticipatedFeedBack\" : {\r\n    \"dislike\" : \"dislike\",\r\n    \"rating\" : \"rating\",\r\n    \"likes\" : \"likes\"\r\n  }\r\n}, {\r\n  \"Unregistered\" : {\r\n    \"comment\" : \"comment\"\r\n  },\r\n  \"NotParticipated\" : {\r\n    \"comment\" : \"comment\"\r\n  },\r\n  \"ParticipatedFeedBack\" : {\r\n    \"dislike\" : \"dislike\",\r\n    \"rating\" : \"rating\",\r\n    \"likes\" : \"likes\"\r\n  }\r\n} ]",
							Feedback.class), HttpStatus.NOT_IMPLEMENTED));
				} catch (IOException e) {
					log.error("Couldn't serialize response for content type application/json", e);
					return Flux.just(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
				}
			}
		} else {
			log.warn(
					"ObjectMapper or HttpServletRequest not configured in default FeedbacksApi interface so no example is generated");
		}
		return Flux.just(new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED));
	}

}
