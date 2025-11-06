# Small Java Initiation projects: 
- Building 
- Conversion

# Java programs exploring thread management and inter-thread communication for multithreaded code.

- **Op1: Destroying a Thread Group (Deprecated methods)**
  - Attempts to destroy a group of threads.

- **Op2: Finding All Threads of a Common Group**
  - Lists all active threads belonging to a specified thread group.

- **Op3: Interrupting a Thread**
  - Demonstrates how to interrupt a running thread and handle the interruption.

- **Op4: Managing Thread Priorities**
  - Assign and Adjust priorities across threads.

- **Op5: Forcing JVM Garbage Collection (Deprecated methods)**
  - Triggers garbage collector.

- **Op6: Inter-Thread Communication via Pipes**
  - Two threads (TA and TB) communicate using `PipedInputStream` and `PipedOutputStream`:
    - TA reads numbers from a file passed as an argument and sends them to TB via `pipeA`.
    - TB receives the numbers, computes their sum, and sends the result back to TA via `pipeB`.
    - TA reads the sum and returns it.
