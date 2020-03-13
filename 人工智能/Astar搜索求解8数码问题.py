# -*- coding:utf-8 -*-

class Solution:

    def salvePuzzle(self, init, targ):
        ''' 求解8数码问题
        参数：
        init - 初始状态 例如'123046758'
        targ - 目标状态 均为'012345678'
        返回值：
        clf - 由udlr组成的移动路径字符串
        123
        046
        758
        '''

        # 请在这里补充代码，完成本关任务
        # ********** Begin **********#
        # parent distance
        class Node:
            def __int__(self):
                self.id = ''
                self.fx = ''
                self.ds = 999

        list = []
        map = {}
        closeMap = {}
        node = Node()
        node.dis = 0
        node.id = init
        node.parent = None
        list.append(node)
        map[init] = node
        while len(list) != 0:
            first = list.pop(0)
            #if first.id  in map:
            del map[first.id]
            closeMap[first.id] = first
            if first.id == targ:
                res = ''
                while first is not None:
                    if hasattr(first, 'fx'):
                        res = first.fx + res
                    first = first.parent
                return res

            # find 0
            index0 = first.id.index('0')
            if index0 - 3 >= 0:
                tempStr = self.moveMap(first.id, index0, index0 - 3)
                tempNode = Node()
                self.checkNode(tempStr, first, tempNode, map, closeMap, 'u', list)
            if index0 + 3 < len(first.id):
                tempStr = self.moveMap(first.id, index0, index0 + 3)
                tempNode = Node()
                self.checkNode(tempStr, first, tempNode, map, closeMap, 'd', list)
            if index0 % 3 > 0:
                tempStr = self.moveMap(first.id, index0, index0 - 1)
                tempNode = Node()
                self.checkNode(tempStr, first, tempNode, map, closeMap, 'l', list)
            if (index0 % 3) < 2:
                tempStr = self.moveMap(first.id, index0, index0 + 1)
                tempNode = Node()
                self.checkNode(tempStr, first, tempNode, map, closeMap, 'r', list)
            list.sort(key=lambda x: x.dis)

        # ********** End **********#

    def checkNode(self, tempStr, first, tempNode, map, closeMap, fx, list):
        if tempStr not in closeMap:
            tempNode.id = tempStr
            tempNode.dis = self.calcDistH(first.id, tempStr)
            tempNode.parent = first
            tempNode.fx = fx
            if tempStr in map:
                if map[tempStr].dis > tempNode.dis:
                    map[tempStr].dis = tempNode.dis
                    map[tempStr].parent = first
                    map[tempStr].fx = fx
            else:
                list.append(tempNode)
                map[tempStr] = tempNode

    def calcDistH(self, src_map, dest_map):
        '''启发式函数h(n)
        参数：
        src_map  - 当前8数码状态
        dest_map - 目标8数码状态
        返回值：
        clf - 当前状态到目标状态的启发式函数值
        '''

        # 请在这里补充代码，完成本关任务
        # ********** Begin **********#
        res = 0
        for i in range(len(src_map)):
            res += abs(int(src_map[i]) - int(dest_map[i]))
        return res
        # ********** End **********#

    def moveMap(self, cur_map, i, j):
        '''状态转换（交换位置i和j）
        参数：
        cur_map - 当前8数码状态
        i - 当前8数码状态中空格0的位置索引
        j - 将空格0的位置i移动到位置j，位置j移动到位置i
        返回值：
        clf - 新的8数码状态
        '''

        # 请在这里补充代码，完成本关任务
        # ********** Begin **********#
        tempV = cur_map[i]
        cur_map = cur_map[:i] + cur_map[j] + cur_map[i + 1:]
        cur_map = cur_map[:j] + tempV + cur_map[j + 1:]
        return cur_map
        # ********** End **********#


obj = Solution()
print(obj.salvePuzzle('234150768', '012345678'))
print('over')