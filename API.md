# API Documentation

## Overview
This document describes the available APIs for the Demo entity in the geminitest application.

## Base URL
All endpoints are relative to the base URL: `/demo`

## Data Models

### Demo
```json
{
  "id": "string",
  "name": "string",
  "comment": "string"
}
```

### WebResult
```json
{
  "success": "boolean",
  "data": "object|array",
  "errorMsg": "string",
  "total": "integer"
}
```

## API Endpoints

### 1. Search Demos
**Endpoint:** `/searchDemo.do`  
**Method:** GET  
**Description:** Search for demos with optional filtering  

**Parameters:**
| Parameter | Type | Required | Description |
|-----------|------|----------|-------------|
| simpleSearch | string | No | Search term to filter demos by name |

**Response:**
```json
{
  "success": true,
  "data": [
    {
      "id": "string",
      "name": "string",
      "comment": "string"
    }
  ],
  "errorMsg": "string",
  "total": "integer"
}
```

---

### 2. Search Demos with Paging
**Endpoint:** `/searchDemoPaging.do`  
**Method:** GET  
**Description:** Search for demos with pagination and sorting  

**Parameters:**
| Parameter | Type | Required | Description |
|-----------|------|----------|-------------|
| simpleSearch | string | No | Search term to filter demos by name |
| start | integer | Yes | Starting index for pagination |
| limit | integer | Yes | Number of items per page |
| sort | string | No | Field to sort by (id, name, comment) |
| dir | string | No | Sort direction (ASC or DESC) |

**Response:**
```json
{
  "success": true,
  "data": [
    {
      "id": "string",
      "name": "string",
      "comment": "string"
    }
  ],
  "errorMsg": "string",
  "total": "integer"
}
```

---

### 3. Add Demo
**Endpoint:** `/addDemo.do`  
**Method:** POST  
**Description:** Add a new demo record  

**Parameters:**
| Parameter | Type | Required | Description |
|-----------|------|----------|-------------|
| formString | string (JSON) | Yes | JSON string representation of Demo object |

**Request Body Example:**
```json
{
  "formString": "{\"name\": \"Demo Name\", \"comment\": \"Demo Comment\"}"
}
```

**Response:**
```json
{
  "success": true,
  "data": null,
  "errorMsg": "string",
  "total": null
}
```

---

### 4. Update Demo
**Endpoint:** `/updateDemo.do`  
**Method:** POST  
**Description:** Update an existing demo record  

**Parameters:**
| Parameter | Type | Required | Description |
|-----------|------|----------|-------------|
| formString | string (JSON) | Yes | JSON string representation of Demo object with ID |

**Request Body Example:**
```json
{
  "formString": "{\"id\": \"demo-id\", \"name\": \"Updated Name\", \"comment\": \"Updated Comment\"}"
}
```

**Response:**
```json
{
  "success": true,
  "data": null,
  "errorMsg": "string",
  "total": null
}
```

---

### 5. Get Demo by ID
**Endpoint:** `/getDemoById.do`  
**Method:** GET  
**Description:** Retrieve a specific demo by its ID  

**Parameters:**
| Parameter | Type | Required | Description |
|-----------|------|----------|-------------|
| id | string | Yes | ID of the demo to retrieve |

**Response:**
```json
{
  "success": true,
  "data": {
    "id": "string",
    "name": "string",
    "comment": "string"
  },
  "errorMsg": "string",
  "total": null
}
```

---

### 6. Delete Demo
**Endpoint:** `/deleteDemo.do`  
**Method:** POST  
**Description:** Delete a demo by its ID  

**Parameters:**
| Parameter | Type | Required | Description |
|-----------|------|----------|-------------|
| id | string | Yes | ID of the demo to delete |

**Response:**
```json
{
  "success": true,
  "data": null,
  "errorMsg": "string",
  "total": null
}
```

---

### 7. Batch Delete Demos
**Endpoint:** `/batchDeleteDemo.do`  
**Method:** POST  
**Description:** Delete multiple demos by their IDs  

**Parameters:**
| Parameter | Type | Required | Description |
|-----------|------|----------|-------------|
| idArray | string (JSON array) | Yes | JSON array of demo IDs to delete |

**Request Body Example:**
```json
{
  "idArray": "[\"id1\", \"id2\", \"id3\"]"
}
```

**Response:**
```json
{
  "success": true,
  "data": null,
  "errorMsg": "string",
  "total": null
}
```
