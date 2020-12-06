def recursion(level, param1, param2, ...):
  # 1. terminator
  if level > MAX_LEVEL:
    # process_result
    return
  
  # 2. process logic
  process(level, data, ...)
  
  # 3. drill down
  self.recursion(level+1, param1, param2,...)

  # 4. clear status if needed
  

